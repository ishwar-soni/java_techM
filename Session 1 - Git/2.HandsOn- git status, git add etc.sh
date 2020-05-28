
# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/gitExample (master)
$ git status
# On branch master

# No commits yet

# Untracked files:
#   (use "git add <file>..." to include in what will be committed)
#         File1.txt

# nothing added to commit but untracked files present (use "git add" to track)

# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/gitExample (master)
$ git add --all

# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/gitExample (master)
$ git status
# On branch master

# No commits yet

# Changes to be committed:
#   (use "git rm --cached <file>..." to unstage)
#         new file:   File1.txt


# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/gitExample (master)
$ git status
# On branch master

# No commits yet

# Changes to be committed:
#   (use "git rm --cached <file>..." to unstage)
#         new file:   File1.txt

# Changes not staged for commit:
#   (use "git add <file>..." to update what will be committed)
#   (use "git restore <file>..." to discard changes in working directory)
#         modified:   File1.txt

# Untracked files:
#   (use "git add <file>..." to include in what will be committed)
#         File2.txt


# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/gitExample (master)
$ git add --all

# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/gitExample (master)
$ git status
# On branch master

# No commits yet

# Changes to be committed:
#   (use "git rm --cached <file>..." to unstage)
#         new file:   File1.txt
#         new file:   File2.txt


# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/gitExample (master)
$ git commit -m "First Commit"
# [master (root-commit) 2475b1d] First Commit
#  2 files changed, 1 insertion(+)
#  create mode 100644 File1.txt
#  create mode 100644 File2.txt

# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/gitExample (master)
$ git push -u origin master
# Enumerating objects: 4, done.
# Counting objects: 100% (4/4), done.
# Delta compression using up to 4 threads
# Compressing objects: 100% (2/2), done.
# Writing objects: 100% (4/4), 274 bytes | 274.00 KiB/s, done.
# Total 4 (delta 0), reused 0 (delta 0)
# To https://github.com/sndpoffcl/gitDemo.git
#  * [new branch]      master -> master
# Branch 'master' set up to track remote branch 'master' from 'origin'.

# SandeepSinha@DESKTOP-OOM59NQ MINGW64 /d/gitExample (master)
$ git status
# On branch master
# Your branch is up to date with 'origin/master'.

# nothing to commit, working tree clean
