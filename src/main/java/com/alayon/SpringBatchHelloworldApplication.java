package com.alayon;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchHelloworldApplication {

	public static void main(final String[] args) throws Exception {
		// SpringApplication.run(SpringBatchHelloworldApplication.class, args);
		int x = (x = 3) * 4;
		System.out.println(x);
		final List<StringBuilder> messages = List.of(new StringBuilder(), new StringBuilder());
		messages.forEach(s -> s.append("helloworld"));
		messages.forEach(s -> {
			s.insert(5, ",");
			System.out.println(s);
		});
		final Object t = new Integer(107);
		final int k = (Integer) t.intValue() / 9;
		System.out.println(k);
	}

}
