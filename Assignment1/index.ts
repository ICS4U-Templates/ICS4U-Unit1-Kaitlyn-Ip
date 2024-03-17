/* This program is the Rock paper scissors game.
 *
 * Created by: Kaitlyn Ip
 * Version: 1.0
 * Since: 2024-03-07
 */


import { createPrompt } from 'bun-promptx'

// Generating random number between 1 and 3
const randomNumber = Math.floor(Math.random() * 3) + 1

// Input
const player = createPrompt("Decide on a move (rock, paper, or scissors): ")

let computer = String(randomNumber)

// Assigning computer's move based on the generated random number
if (randomNumber === 1) {
  computer = "rock"
} else if (randomNumber === 2) {
  computer = "paper"
} else if (randomNumber === 3) {
  computer = "scissors"
}

// Process & Output
if (player.value === computer) {
  console.log(`\nComputer chose ${computer}.`)
  console.log("\nTie.")
} else if (
  (player.value === "rock" && computer === "paper") ||
  (player.value === "paper" && computer === "scissors") ||
  (player.value === "scissors" && computer === "rock")
) {
  console.log(`\nComputer chose ${computer}.`)
  console.log("\nYou lost.")
} else if (
  (player.value === "paper" && computer === "rock") ||
  (player.value === "scissors" && computer === "paper") ||
  (player.value === "rock" && computer === "scissors")
) {
  console.log(`\nComputer chose ${computer}.`)
  console.log("\nYou win!")
} else {
  console.log("\nInvalid input.")
}

console.log("\nDone.")
