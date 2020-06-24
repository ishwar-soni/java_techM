# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git branch newBranch

# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git checkout newBranch
# Switched to branch 'newBranch'
# M       File2.txt

# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (newBranch)
$ git status
# On branch newBranch
# Changes not staged for commit:
#   (use "git add <file>..." to update what will be committed)
#   (use "git restore <file>..." to discard changes in working directory)
#         modified:   File2.txt

# no changes added to commit (use "git add" and/or "git commit -a")

# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (newBranch)
$ git add .

# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (newBranch)
$ git status
# On branch newBranch
# Changes to be committed:
#   (use "git restore --staged <file>..." to unstage)
#         modified:   File2.txt


# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (newBranch)
$ git commit -m "New branch"
# [newBranch 0af70a8] New branch
#  1 file changed, 3 insertions(+), 1 deletion(-)


# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (newBranch)
$ git checkout master
# Switched to branch 'master'
# Your branch is up to date with 'origin/master'.

# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git merge newBranch
# Updating 75e248b..0af70a8
# Fast-forward
#  File2.txt | 4 +++-
#  1 file changed, 3 insertions(+), 1 deletion(-)

# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/upGrad/learn-git (master)
$ git push
# Enumerating objects: 5, done.
# Counting objects: 100% (5/5), done.
# Delta compression using up to 4 threads
# Compressing objects: 100% (3/3), done.
# Writing objects: 100% (3/3), 318 bytes | 318.00 KiB/s, done.
# Total 3 (delta 0), reused 0 (delta 0)
# To https://github.com/sndpoffcl/gitDemo.git
#    75e248b..0af70a8  master -> master

