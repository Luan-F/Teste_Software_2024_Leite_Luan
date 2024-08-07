/*
 * Copyright 2015-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public float div(float a, float b) throws Exception {
		if (b == 0) throw new Exception("Divisão por zero");
		return a / b;
	}

	public float avg(float[] values) throws Exception {
		float sum = 0;
		float len = values.length;

		for (int i = 0; i < len; ++i) {
			sum += values[i];
		}

		return div(sum, len);
	}
}
