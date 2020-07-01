#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ vim File1.txt
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ vim File2.txt
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ vim File3.txt
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git status
#On branch master
#Your branch is ahead of 'origin/master' by 5 commits.
#  (use "git push" to publish your local commits)
#
#Untracked files:
#  (use "git add <file>..." to include in what will be committed)
#        File1.txt
#        File2.txt
#        File3.txt
#
#nothing added to commit but untracked files present (use "git add" to track)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git add File1.txt
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git status
#On branch master
#Your branch is ahead of 'origin/master' by 5 commits.
#  (use "git push" to publish your local commits)
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
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git add .
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git status
#On branch master
#Your branch is ahead of 'origin/master' by 5 commits.
#  (use "git push" to publish your local commits)
#
#Changes to be committed:
#  (use "git restore --staged <file>..." to unstage)
#        new file:   File1.txt
#        new file:   File2.txt
#        new file:   File3.txt
#
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git commit -m "added three files"
#[master c54a76a] added three files
# 3 files changed, 1 insertion(+)
# create mode 100644 File1.txt
# create mode 100644 File2.txt
# create mode 100644 File3.txt
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git status
#On branch master
#Your branch is ahead of 'origin/master' by 6 commits.
#  (use "git push" to publish your local commits)
#
#nothing to commit, working tree clean
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ vim File2.txt
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git status
#On branch master
#Your branch is ahead of 'origin/master' by 6 commits.
#  (use "git push" to publish your local commits)
#
#Changes not staged for commit:
#  (use "git add <file>..." to update what will be committed)
#  (use "git restore <file>..." to discard changes in working directory)
#        modified:   File2.txt
#
#no changes added to commit (use "git add" and/or "git commit -a")
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git commit -a -m "file2 updated"
#warning: LF will be replaced by CRLF in File2.txt.
#The file will have its original line endings in your working directory
#[master ecc318f] file2 updated
# 1 file changed, 1 insertion(+), 1 deletion(-)
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git status
#On branch master
#Your branch is ahead of 'origin/master' by 7 commits.
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
#    file2 updated
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
#    file2 updated
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git push origin master
#Enumerating objects: 22, done.
#Counting objects: 100% (22/22), done.
#Delta compression using up to 4 threads
#Compressing objects: 100% (17/17), done.
#Writing objects: 100% (19/19), 1.77 KiB | 361.00 KiB/s, done.
#Total 19 (delta 5), reused 0 (delta 0)
#remote: Resolving deltas: 100% (5/5), done.
#To https://github.com/sndpoffcl/learn-git.git
#   24a3752..ecc318f  master -> master
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git push -u origin master
#Everything up-to-date
#Branch 'master' set up to track remote branch 'master' from 'origin'.
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$ git push
#Everything up-to-date
#
#SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/learn-git (master)
$
#