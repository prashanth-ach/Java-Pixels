package week4;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.TimeUnit;
public class Trial{
	
private static void printUsage() throws InterruptedException {
  OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
  for (Method method : operatingSystemMXBean.getClass().getDeclaredMethods()) {
    method.setAccessible(true);
    if (method.getName().startsWith("get") 
        && Modifier.isPublic(method.getModifiers())) {
            Object value;
        try {
            value = method.invoke(operatingSystemMXBean);
        } catch (Exception e) {
            value = e;
        } 
        // try
        TimeUnit.SECONDS.sleep(10);
        System.out.println(method.getName() + " = " + value);
    } // if
  } // for
}
public static void main(String[] args) throws InterruptedException {
    new Trial();
	Trial.printUsage();
}}