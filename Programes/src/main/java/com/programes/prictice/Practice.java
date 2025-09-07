package com.programes.prictice;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {

		List<String> list = List.of("geeks for greek", "kseeg", "lists", "grams");

		try {
			Constructor<?> constructor = Practice.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			Practice newInstance = (Practice) constructor.newInstance();

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		long[] deadlockedThreads = threadMXBean.findDeadlockedThreads();

		if (null != deadlockedThreads) {

			ThreadInfo[] threadInfo = threadMXBean.getThreadInfo(deadlockedThreads);

			for (ThreadInfo info : threadInfo) {

			}

		}

		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size() - 1; j++) {

				String firstStr = list.get(i);
				String secondStr = list.get(j);

				char[] charArray = secondStr.toCharArray();

				List<Character> collect = secondStr.chars().mapToObj(c -> (char) c).collect(Collectors.toList())
						.stream().filter(x -> firstStr.contains(x.toString())).collect(Collectors.toList());

				collect.stream().forEach(x -> {
					System.out.print(x);
					System.err.println("============  ");
				});

			}

		}

	}

}
