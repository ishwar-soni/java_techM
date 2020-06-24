#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git status
#On branch master
#Your branch is up to date with 'origin/master'.
#
#Untracked files:
#  (use "git add <file>..." to include in what will be committed)
#        File1.txt
#        File2.txt
#        File3.txt
#
#nothing added to commit but untracked files present (use "git add" to track)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git add File1.txt
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git status
#On branch master
#Your branch is up to date with 'origin/master'.
#
#Changes to be committed:
#  (use "git restore --staged <file>..." to unstage)
#        new file:   File1.txt
#
#Untracked files:
#  (use "git add <file>..." to include in what will be committed)
#        File2.txt
#        File3.txt
#
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git add .
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git status
#On branch master
#Your branch is up to date with 'origin/master'.
#
#Changes to be committed:
#  (use "git restore --staged <file>..." to unstage)
#        new file:   File1.txt
#        new file:   File2.txt
#        new file:   File3.txt
#
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git commit -m "added three files"
#[master 9059896] added three files
# 3 files changed, 1 insertion(+)
# create mode 100644 File1.txt
# create mode 100644 File2.txt
# create mode 100644 File3.txt
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ ggit status
#bash: ggit: command not found
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git status
#On branch master
#Your branch is ahead of 'origin/master' by 1 commit.
#  (use "git push" to publish your local commits)
#
#nothing to commit, working tree clean
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git log --all
#commit 9059896684f5ab22949d92bb5d7a12dcc5b1d693 (HEAD -> master)
#Author: Sandeep Sinha <sandeep2official@gmail.com>
#Date:   Wed Jun 24 20:27:52 2020 +0530
#
#    added three files
#
#commit b9c0c72ab4789c187ca9c429e0af8d2d59fa5466 (origin/master)
#Author: Sandeep Sinha <sandeep2official@gmail.com>
#Date:   Wed Jun 24 20:12:38 2020 +0530
#
#    first commit
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git log -1
#commit 9059896684f5ab22949d92bb5d7a12dcc5b1d693 (HEAD -> master)
#Author: Sandeep Sinha <sandeep2official@gmail.com>
#Date:   Wed Jun 24 20:27:52 2020 +0530
#
#    added three files
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git log --committer="Sandeep Sinha"
#commit 9059896684f5ab22949d92bb5d7a12dcc5b1d693 (HEAD -> master)
#Author: Sandeep Sinha <sandeep2official@gmail.com>
#Date:   Wed Jun 24 20:27:52 2020 +0530
#
#    added three files
#
#commit b9c0c72ab4789c187ca9c429e0af8d2d59fa5466 (origin/master)
#Author: Sandeep Sinha <sandeep2official@gmail.com>
#Date:   Wed Jun 24 20:12:38 2020 +0530
#
#    first commit
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git status
#On branch master
#Your branch is ahead of 'origin/master' by 1 commit.
#  (use "git push" to publish your local commits)
#
#nothing to commit, working tree clean
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git push origin master
#Enumerating objects: 5, done.
#Counting objects: 100% (5/5), done.
#Delta compression using up to 4 threads
#Compressing objects: 100% (2/2), done.
#Writing objects: 100% (4/4), 341 bytes | 341.00 KiB/s, done.
#Total 4 (delta 0), reused 0 (delta 0)
#To https://github.com/sndpoffcl/learn-git.git
#   b9c0c72..9059896  master -> master
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git push -u origin master
#Everything up-to-date
#Branch 'master' set up to track remote branch 'master' from 'origin'.
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git push
#Everything up-to-date
#