const tControl = new TasksController();

{
let today = new Date();
let stringMonth = (today.getMonth() + 1).toString();
if(stringMonth.length < 2){stringMonth = "0" + stringMonth;}
let stringDate = today.getDate().toString();
if(stringDate.length < 2){stringDate = "0" + stringDate;}
newTargetDate.min = `${today.getFullYear()}-${stringMonth}-${stringDate}`;
}

newTaskForm.addEventListener('submit', (event) => {

    event.preventDefault();

    const newTaskTitle = document.querySelector('#newTitle');
    const newTaskDescription = document.querySelector('#newDescription');
    const newTaskTarget = document.querySelector('#newTargetDate');


    const title = newTaskTitle.value;
    const description = newTaskDescription.value;
    const targetDate = newTaskTarget.value;

    newTaskTitle.value = '';
    newTaskDescription.value = '';
    newTaskTarget.value = '';

    tControl.addTask(title, description, targetDate);
});
