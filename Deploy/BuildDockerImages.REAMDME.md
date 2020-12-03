Build docker images

Pre-Req: make sure website_backend and website_frontend are populated.  
then run the following in terminal. This assumes the docker images will be pushed freeopenuniversity account.

docker login -u freeopenuniversity

cd website-backend
docker build -f Deploy/Dockerfile_Db -t freeopenuniversity/version0:openfree-db-img ./database
docker push freeopenuniversity/version0:openfree-db-img

Build service docker images:
docker build -f Deploy/Dockerfile -t freeopenuniversity/version0:openfree-service-img ./
docker push freeopenuniversity/version0:openfree-service-img

---

cd website-frontend
docker build -t freeopenuniversity/version0:openfree-web-img .
freeopenuniversity/version0:openfree-web-img
