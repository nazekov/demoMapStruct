package kg.mega.demomapstruct.controller;

import kg.mega.demomapstruct.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/run/{taskNum}")
    public Object run(@PathVariable int taskNum) {
        return taskService.run(taskNum);
    }
}
