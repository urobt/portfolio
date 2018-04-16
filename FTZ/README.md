FTZ 파일을 git hub에 save. 

tar: https://goo.gl/YZVPBs
tar cvf test.tar ./*

file split: https://goo.gl/mGY7c1

file 병합 : https://goo.gl/xKbyj1
cat test.zip.* > test.zip
zip -FF test.zip --out test-full.zip
unzip test-full.zip

lfs install : https://goo.gl/qk8hZA
sudo apt-get install software-properties-common
sudo add-apt-repository ppa:git-core/ppa
sudo apt-get update

curl -s https://packagecloud.io/install/repositories/github/git-lfs/script.deb.sh | sudo bash
sudo apt-get install git-lfs
git lfs install

use lfs: https://goo.gl/rff8Sd
git lfs track “*.iso”
git lfs track "*.zip"

git :1. https://goo.gl/U3oJHQ / 2. https://goo.gl/cZ24bn /3. https://goo.gl/fw5cmn
git clone 주소
git add *
git commit -m "expain"
git push origin master 
