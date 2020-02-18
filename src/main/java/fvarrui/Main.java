package fvarrui;

import java.util.HashMap;
import java.util.Map;

import fvarrui.expreval.Param;

import static fvarrui.expreval.ExprEval.*;

public class Main {
	
	public static void main(String[] args) {
		sample0();
		sample1();
		sample2();
		sample3();
	}
	
	// hardcoded
	private static void sample0() {
		Double ancho = 15.0;
		Double alto = 6.0;
		Double result = Math.sqrt(ancho / alto);
		System.out.println(result);
	}

	private static void sample1() {
		Map<String, Object> params = new HashMap<>();
		params.put("ancho", 15);
		params.put("alto", 6);
		Double result = eval("Math.sqrt(ancho / alto)", params);
		System.out.println(result);
	}

	private static void sample2() {
		Double result = eval("Math.sqrt(ancho / alto)", param("ancho", 15), param("alto", 6));
		System.out.println(result);
	}

	private static void sample3() {
		Param<?> [] params = { param("ancho", 15), param("alto", 6) };
		Double result = eval("Math.sqrt(ancho / alto)", params);
		System.out.println(result);
	}
	
}
