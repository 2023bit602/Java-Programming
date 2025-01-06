## Command i used to download java:
sudo apt install openjdk-17-jdk
sudo apt install openjdk-17-jdk-source

## when you have multiple java versions installed to choose which to use:
sudo update-alternatives --config java

## check for installed java packages:
dpkg --get-selections | grep -i openjdk

## for uninstallation : 
sudo apt purge openjdk-17-jdk

