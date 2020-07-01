#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git branch DEV
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git checkout DEV
#Switched to branch 'DEV'
#M       File2.txt
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (DEV)
$ git status
#On branch DEV
#Changes not staged for commit:
#  (use "git add <file>..." to update what will be committed)
#  (use "git restore <file>..." to discard changes in working directory)
#        modified:   File2.txt
#
#no changes added to commit (use "git add" and/or "git commit -a")
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (DEV)
$ git add .
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (DEV)
$ git status
#On branch DEV
#Changes to be committed:
#  (use "git restore --staged <file>..." to unstage)
#        modified:   File2.txt
#
#
# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (DEV)
$ git commit -m "New branch"
# [newBranch 0af70a8] New branch
#  1 file changed, 3 insertions(+), 1 deletion(-)

#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (DEV)
$ git checkout master
# Switched to branch 'master'
# Your branch is up to date with 'origin/master'.
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git merge DEV
# Updating 75e248b..0af70a8
# Fast-forward
#  File2.txt | 4 +++-
#  1 file changed, 3 insertions(+), 1 deletion(-)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git add .
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git commit -m "merging done"
#[master f839831] merging done
# 1 file changed, 1 insertion(+)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git push
#Enumerating objects: 20, done.
#Counting objects: 100% (20/20), done.
#Delta compression using up to 4 threads
#Compressing objects: 100% (17/17), done.
#Writing objects: 100% (17/17), 2.78 KiB | 950.00 KiB/s, done.
#Total 17 (delta 9), reused 0 (delta 0)
#remote: Resolving deltas: 100% (9/9), completed with 2 local objects.
#To https://github.com/sndpoffcl/learn-git.git
#   ecc318f..f839831  master -> master
#