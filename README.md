# OOP_LAB
## IT3103 - Lập trình hướng đối tượng (Thực Hành)
###Step 1: Basic Initialization
1.	Install Oracle JDK 8: [Download and Install Java](https://www.java.com/en/) Current
2.  Eclipse: We recommend Eclipse IDE for Enterprise Java Developers. Download the suitable binary file at the following link. [Download and Install Eclipse](https://www.eclipse.org/downloads/packages/)

### Step 2: Workflow 
 #### GIT
 1. Commit & upload the work
```
    git checkout [your_branch]
    git pull origin master
    git add .
    git commit -m 'commit messsage'
    git push origin [your_branch]
```
 2. Delete your old branch after finish your work then create new branch to start working on next feature
```
    git branch -d [old branch]
    git switch -c "new branch"
    git push -u origin [new branch]
```
 3. Create Pull request: After you commit and push to the remote repository, if there is any conflict when creating merge request, you need to resolve conflicts.
```
    git checkout master
    git pull origin master
    git checkout <your_branch>
    git rebase master
    git add -A
    git status
    git rebase –continue
```
