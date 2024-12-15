/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.myapp.textprocessor;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a text:");
        String input = scanner.nextLine();

        // Check if the string is blank
        if (StringUtils.isBlank(input)) {
            System.out.println("The input is blank or empty!");
            return;
        }

        // Reverse the string
        String reversed = StringUtils.reverse(input);
        System.out.println("Reversed Text: " + reversed);

        // Count the number of words
        int wordCount = StringUtils.split(input, ' ').length;
        System.out.println("Word Count: " + wordCount);

        // Capitalize the text
        String capitalized = StringUtils.capitalize(input);
        System.out.println("Capitalized Text: " + capitalized);

        // Compare two numbers
        System.out.println("Enter a number:");
        String number1 = scanner.nextLine();
        System.out.println("Enter another number:");
        String number2 = scanner.nextLine();

        try {
            int compareResult = Double.compare(
                    Double.parseDouble(number1),
                    Double.parseDouble(number2)
            );
            if (compareResult == 0) {
                System.out.println("Both numbers are equal.");
            } else if (compareResult < 0) {
                System.out.println("The first number is smaller.");
            } else {
                System.out.println("The first number is larger.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers provided.");
        }

        scanner.close();
    }
}
