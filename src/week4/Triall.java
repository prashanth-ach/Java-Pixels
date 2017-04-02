package week4;
import java.lang.management.ManagementFactory;

import com.sun.management.OperatingSystemMXBean;

public class Triall
{
	public static void main(String[] args) throws InterruptedException {
		
		OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(
                OperatingSystemMXBean.class);
		
		
		System.out.println(osBean.getCommittedVirtualMemorySize());
		//Returns the amount of virtual memory that is guaranteed to be available to the running process in bytes
		

		System.out.println(osBean.getFreePhysicalMemorySize());
		//Returns the amount of free physical memory in bytes.

		System.out.println(osBean.getFreeSwapSpaceSize());
		//Returns the amount of free swap space in bytes.
       

		System.out.println(osBean.getSystemCpuLoad());
		//Returns the "recent cpu usage" for the whole system.
		
		System.out.println(osBean. getTotalPhysicalMemorySize());
		//Returns the total amount of physical memory in bytes.

		System.out.println(osBean.getTotalSwapSpaceSize());
		//Returns the total amount of swap space in bytes.

	}
}