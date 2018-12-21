package com.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import play.mvc.Http;

public class DemoController extends play.mvc.Controller {

	public CompletionStage<play.mvc.Result> foo(Http.Request request,
			Integer int1, Integer int2, String str1) {

		System.out.println(request);
		System.out.println(int1);
		System.out.println(int2);
		System.out.println(str1);

		return CompletableFuture.completedFuture(ok());
	}

}
