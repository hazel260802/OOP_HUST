# OOP_HUST 
## IT3103 - Lập trình hướng đối tượng (Thực Hành + Lý thuyết)
###Step 1: Basic Initialization
1.	Install Oracle JDK 8: [Download and Install Java](https://www.java.com/en/) Current
2.  Eclipse: We recommend Eclipse IDE for Enterprise Java Developers. Download the suitable binary file at the following link. [Download and Install Eclipse](https://www.eclipse.org/downloads/packages/)
3. Astah UML: [Download and Install Astah](http://astah.net/student-license-request). Then follow the 3 steps in the redirected page [Information page](http://astah.net/student/thank-you) & [Guidance to case diagram with Astah](http://astah.net/manual/422-usecase-diagram).
4. JavaFX: [Download and Install JavaFX](https://gluonhq.com/products/javafx/)
- Download, decompress, copy files from the lib folder and add to project build path
- Note to run JavaFX in Eclipse. Go to runtime configuration and configure VM arguments as follows:
```
--module-path ${project_classpath:REPLACE_ME_WITH_YOUR_PROJECT_NAME} --add-  modules javafx.controls,javafx.fxml
```
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
 #### LAB
1. Create simple GUI applications with JavaFX: AIMS project (AIMS stands for An Internet Media Store)
2. Use many OOP techniques
 #### LECTURE
 1. Some examples given by Professor Trịnh Tuấn Đạt 
 2. A final exercise: Dice Game  

 
