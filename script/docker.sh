#!/bin/sh

#1. Set up the repository

#Set up the Docker CE repository on CentOS:

sudo yum install -y yum-utils

sudo yum-config-manager \
    --add-repo \
    https://download.docker.com/linux/centos/docker-ce.repo

sudo yum makecache fast

#2. Get Docker CE

#Install the latest version of Docker CE on CentOS:

sudo yum -y install docker-ce
# Start Docker:

sudo systemctl enable docker
sudo systemctl start docker

#3. Test your Docker CE installation

#Test your installation:
 
#sudo docker run hello-world


# 安装docker查看命令  docker-enter <container> ls
wget -P ~ https://github.com/yeasy/docker_practice/raw/master/_local/.bashrc_docker;
echo "[ -f ~/.bashrc_docker ] && . ~/.bashrc_docker" >> ~/.bashrc; source ~/.bashrc