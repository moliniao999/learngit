package com.springmvc.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("taskJob2")
public class TaskJob2 {
	
	@Scheduled(cron = "0 5 23 * * ?")  
	public void job2(){
		System.out.println("  job2任务开始啦     。。。。。。");
	}
	
}
