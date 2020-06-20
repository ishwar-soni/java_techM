#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (RahulOrders)
$ git branch
#  master
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (RahulOrders)
$ git checkout -b intialCodeSetup
#Switched to a new branch 'initialCodeSetup'
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (intialCodeSetup)
$ git add .
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (intialCodeSetup)
$ git commit -m "intial code stub added"
#[intialCodeSetup (root-commit) add0c03] intial code stub added
# 2 files changed, 11 insertions(+)
# create mode 100644 PartyOrder.java
# create mode 100644 README.md
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (intialCodeSetup)
$ git checkout -b RahulOrders
#Switched to a new branch 'RahulOrders'
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (RahulOrders)
$ git add .
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (RahulOrders)
$ git commit -m "order added for Rahul"
#[RahulOrders 278d3e1] order added for Rahul
# 1 file changed, 3 insertions(+), 3 deletions(-)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (RahulOrders)
$ git checkout initialCodeSetup
#Switched to branch 'initialCodeSetup'
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (initialCodeSetup)
$ git branch
#  RahulOrders
#* initialCodeSetup
#  master
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (initialCodeSetup)
$ git checkout -b RajOrders
#Switched to a new branch 'RajOrders'
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (RajOrders)
$ git add .
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (RajOrders)
$ git commit -m "added order for Raj"
#[RajOrders dc01325] added order for Raj
# 1 file changed, 3 insertions(+), 3 deletions(-)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (RajOrders)
$ git checkout initialCodeSetup
#Switched to branch 'initialCodeSetup'
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (initialCodeSetup)
$ git merge RajOrders
#Updating add0c03..dc01325
#Fast-forward
# PartyOrder.java | 6 +++---
# 1 file changed, 3 insertions(+), 3 deletions(-)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (initialCodeSetup)
$ git diff initialCodeSetup RajOrders
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (initialCodeSetup)
$ git diff RajOrders RahulOrders
#diff --git a/PartyOrder.java b/PartyOrder.java
#index f7d0aad..2e46b94 100644
#--- a/PartyOrder.java
#+++ b/PartyOrder.java
#@@ -1,10 +1,10 @@
# public class partyOrder{
#     public static void main(String[] args){
#-        System.out.println("***PARTY ORDER - Raj***");
#+        System.out.println("***PARTY ORDER - Rahul***");
#         System.out.println("Number of vegetarians");
#-        System.out.println(11);
#+        System.out.println(12);
#         System.out.println("Number of non-vegetarians");
#-        System.out.println(11);
#+        System.out.println(12);
#     }
# }
#
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (initialCodeSetup)
$ git initialCodeSetup RahulOrders
#git: 'initialCodeSetup' is not a git command. See 'git --help'.
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (initialCodeSetup)
$ git diff initialCodeSetup RahulOrders
#diff --git a/PartyOrder.java b/PartyOrder.java
#index f7d0aad..2e46b94 100644
#--- a/PartyOrder.java
#+++ b/PartyOrder.java
#@@ -1,10 +1,10 @@
# public class partyOrder{
#     public static void main(String[] args){
#-        System.out.println("***PARTY ORDER - Raj***");
#+        System.out.println("***PARTY ORDER - Rahul***");
#         System.out.println("Number of vegetarians");
#-        System.out.println(11);
#+        System.out.println(12);
#         System.out.println("Number of non-vegetarians");
#-        System.out.println(11);
#+        System.out.println(12);
#     }
# }
#
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (initialCodeSetup)
$ git log
#commit dc013250e2b397292b133c976c63b7bf6aa15043 (HEAD -> initialCodeSetup, RajOrders)
#Author: Sandeep Sinha <sandeep2official@gmail.com>
#Date:   Sat Jun 20 23:01:35 2020 +0530
#
#    added order for Raj
#
#commit add0c039d25e6cd82849cd4fcf867ac1842d7961
#Author: Sandeep Sinha <sandeep2official@gmail.com>
#Date:   Sat Jun 20 22:59:08 2020 +0530
#
#    intial code stub added
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (initialCodeSetup)
$ git merge RahulOrders
#Auto-merging PartyOrder.java
#CONFLICT (content): Merge conflict in PartyOrder.java
#Automatic merge failed; fix conflicts and then commit the result.
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (initialCodeSetup|MERGING)
$ git merge --abort
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (initialCodeSetup)
$ git status
#On branch initialCodeSetup
#nothing to commit, working tree clean
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/projectRepo (initialCodeSetup)
$
#