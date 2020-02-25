package com.steve.resultsinfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.steve.resultsinfo.models.Result;

@SpringBootApplication
public class ResultsInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResultsInfoApplication.class, args);
	}
	
	@Bean
	public List<Result> getList(){
		return new ArrayList<Result>(Arrays.asList(
				new Result("r1","s1","c1",99),
				new Result("r2","s1","c2",98),
				new Result("r3","s2","c1",99),
				new Result("r4","s2","c2",96),
				new Result("r5","s2","c3",97),
				new Result("r6","s3","c2",92),
				new Result("r7","s4","c1",90),
				new Result("r8","s4","c2",89),
				new Result("r9","s4","c3",79)
		));
	}

}
