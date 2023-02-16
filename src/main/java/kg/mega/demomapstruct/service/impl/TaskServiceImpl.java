package kg.mega.demomapstruct.service.impl;

import kg.mega.demomapstruct.service.PcService;
import kg.mega.demomapstruct.service.TaskService;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class TaskServiceImpl implements TaskService {

    private final PcService pcService;
    private static HashMap<Integer, Object> map;

    public TaskServiceImpl(PcService pcService) {
        this.pcService = pcService;
        initilization();
    }

    @Override
    public Object run(int taskNum) {
        return map.get(taskNum);
    }

    private void initilization() {
        map = new HashMap<>();
        map.put(1, pcService.findByPrice(500));
    }
}
