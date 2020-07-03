#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git add .
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git commit -m "party order template added"
#[master 8f1c457] party order template added
# 1 file changed, 3 insertions(+), 3 deletions(-)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git branch feature1
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git branch feature2
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git checkout feature1
#Switched to branch 'feature1'
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (feature1)
$ vim PartyOrderTemplate.java
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (feature1)
$ git add .
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (feature1)
$ git commit -m "updated party order for feature1"
#[feature1 caa7c20] updated party order for feature1
# 1 file changed, 4 insertions(+), 4 deletions(-)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (feature1)
$ git checkout feature2
#Switched to branch 'feature2'
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (feature2)
$ vim PartyOrderTemplate.java
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (feature2)
$ git add .
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (feature2)
$ git commit -m "updated party order for feature2"
#[feature2 93860d2] updated party order for feature2
# 1 file changed, 4 insertions(+), 4 deletions(-)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (feature2)
$ git checkout master
#Switched to branch 'master'
#Your branch is ahead of 'origin/master' by 3 commits.
#  (use "git push" to publish your local commits)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git diff master feature1
#diff --git a/PartyOrderTemplate.java b/PartyOrderTemplate.java
#index da5015c..af42937 100644
#--- a/PartyOrderTemplate.java
#+++ b/PartyOrderTemplate.java
#@@ -1,9 +1,9 @@
# class PartyOrderTemplate{
#     public static void main(String[] args){
#-        System.out.println("Party Order done by");
#+        System.out.println("Party Order done by - feature1 branch");
#         System.out.println("Number of veg orders");
#-        System.out.println(10);
#+        System.out.println(15);
#         System.out.println("Number of non-veg orders");
#-        System.out.println(10);
#+        System.out.println(15);
#     }
#-}
#\ No newline at end of file
#+}
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git diff master feature2
#diff --git a/PartyOrderTemplate.java b/PartyOrderTemplate.java
#index da5015c..5a48a7b 100644
#--- a/PartyOrderTemplate.java
#+++ b/PartyOrderTemplate.java
#@@ -1,9 +1,9 @@
# class PartyOrderTemplate{
#     public static void main(String[] args){
#-        System.out.println("Party Order done by");
#+        System.out.println("Party Order done by - feature2 branch");
#         System.out.println("Number of veg orders");
#-        System.out.println(10);
#+        System.out.println(20);
#         System.out.println("Number of non-veg orders");
#-        System.out.println(10);
#+        System.out.println(20);
#     }
#-}
#\ No newline at end of file
#+}
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git branch
#  feature1
#  feature2
#* master
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git merge feature1
#Updating 8f1c457..caa7c20
#Fast-forward
# PartyOrderTemplate.java | 8 ++++----
# 1 file changed, 4 insertions(+), 4 deletions(-)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git diff master feature2
#diff --git a/PartyOrderTemplate.java b/PartyOrderTemplate.java
#index af42937..5a48a7b 100644
#--- a/PartyOrderTemplate.java
#+++ b/PartyOrderTemplate.java
#@@ -1,9 +1,9 @@
# class PartyOrderTemplate{
#     public static void main(String[] args){
#-        System.out.println("Party Order done by - feature1 branch");
#+        System.out.println("Party Order done by - feature2 branch");
#         System.out.println("Number of veg orders");
#-        System.out.println(15);
#+        System.out.println(20);
#         System.out.println("Number of non-veg orders");
#-        System.out.println(15);
#+        System.out.println(20);
#     }
# }
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git merge feature2
#Auto-merging PartyOrderTemplate.java
#CONFLICT (content): Merge conflict in PartyOrderTemplate.java
#Automatic merge failed; fix conflicts and then commit the result.
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master|MERGING)
$ git status
#On branch master
#Your branch is ahead of 'origin/master' by 4 commits.
#  (use "git push" to publish your local commits)
#
#You have unmerged paths.
#  (fix conflicts and run "git commit")
#  (use "git merge --abort" to abort the merge)
#
#Unmerged paths:
#  (use "git add <file>..." to mark resolution)
#        both modified:   PartyOrderTemplate.java
#
#no changes added to commit (use "git add" and/or "git commit -a")
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master|MERGING)
$ git merge --abort
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git merge feature2
#Auto-merging PartyOrderTemplate.java
#CONFLICT (content): Merge conflict in PartyOrderTemplate.java
#Automatic merge failed; fix conflicts and then commit the result.
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git ((caa7c20...)|MERGING)
$ git reset
#Unstaged changes after reset:
#M       PartyOrderTemplate.java

#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git ((caa7c20...))
#$ git reset --hard HEAD
#HEAD is now at caa7c20 updated party order for feature1
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git merge feature2
#Auto-merging PartyOrderTemplate.java
#CONFLICT (content): Merge conflict in PartyOrderTemplate.java
#Automatic merge failed; fix conflicts and then commit the result.
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master|MERGING)
$ vim PartyOrderTemplate.java
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master|MERGING)
$
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master|MERGING)
$ git add .
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master|MERGING)
$ git commit -m "merge conflicted resolved"
#[master 5d96c6d] merge conflicted resolved
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
#