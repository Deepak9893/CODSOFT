tasks = []

def display_tasks():
    if not tasks:
        print("to-do list is empty")
    else:
        print("to-do list:")
        for i, task in enumerate(tasks, 1):
            print(f"{i}. {task}")

def add_task():
    task = input("Enter a task: ")
    tasks.append(task)
    print("Task added")

def remove_task():
    task_number = int(input("Enter the task number to remove: "))
    if 0 < task_number <= len(tasks):
        tasks.pop(task_number - 1)
        print("Task removed")
    else:
        print("Invalid task number")

def main():
    while True:
        print("\n1. Add Task")
        print("2. Remove Task")
        print("3. Display Tasks")
        print("4. Exit")
        choice = int(input("Choose an option: "))

        if choice == 1:
            add_task()
        elif choice == 2:
            remove_task()
        elif choice == 3:
            display_tasks()
        elif choice == 4:
            print("Exit")
            break
        else:
            print("Invalid option")

if __name__ == "__main__":
    main()
