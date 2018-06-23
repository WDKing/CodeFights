You and some friends are placing some friendly wagers on a game of dice - whoever guesses the exact sum of the dice rolls wins!

After placing your bet, you start to get a little nervous; you think maybe it'll help to calculate the probability of your number being rolled. You can find the probability by dividing the number of ways to roll your number by the total possible number of rolls. Since you know how to find the total possible number of rolls, you just need to find a way to calculate the number of ways to roll your number.

Given an array dice containing arrays of integers representing the face values of each die, and an integer sum, find the number of different dice roll outcomes that add up to sum.

Since this could be a huge number, return the result mod 109 + 7.

Note: every roll must use all the dice.

Example

For dice = [[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 5, 6]] and sum = 9, the output should be diceRolls(dice, sum) = 4.

There are four rolls that add up to 9: [3, 6], [4, 5], [5, 4], and [6, 3].

For dice = [[2, 4, 6], [1, 3, 5, 7]] and sum = 8, the output should be diceRolls(dice, sum) = 0.

There are no possible rolls that add up to 8 - since the first die has only even numbers and the second has only odd numbers, their sum will always be odd, so there's no way they could add to 8.

Input / Output

[execution time limit] 3 seconds (java)

[input] array.array.integer dice

An array of arrays of integers representing the face values of each die.

Guaranteed constraints:
1 ≤ dice.length ≤ 1000
1 ≤ dice[i].length ≤ 1000
0 ≤ dice[i][j] ≤ 5 · 104

[input] integer sum

An integer representing the number you've wagered on for the sum of the dice roll.

Guaranteed constraints:
0 ≤ sum ≤ 2 · 105

[output] integer

An integer representing the number of ways your number could be rolled with the given dice.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
// 
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}
