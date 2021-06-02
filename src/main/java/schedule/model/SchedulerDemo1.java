package schedule.model;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerDemo1 {
	
	@Scheduled(fixedDelay = 1000, initialDelay = 1000)
	public void methodDemo()
	{
		System.out.println("SchedulerDemo class, methodDemo method");
	}

}
