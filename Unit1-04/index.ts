/** This program makes a number guessing game.
 * Created by: Kaitlyn Ip
 * version: 1.0
 * Since: 2024-02-22
 */
import promptSync from 'prompt-sync'

const randomNumber = Math.floor(Math.random() * 6 + 1)
let counter = 0

while (true) {
  const userString = prompt('Guess a number (1-6): ')
  const userNumber = parseInt(userString)
  counter += 1

  if (userNumber === randomNumber) {
    console.log(`Correct number, it took you ${counter} tries.`)
    break
  } else if (userNumber < randomNumber) {
    console.log('Too low, guess higher.')
  } else if (userNumber > randomNumber) {
    console.log('Too high, guess lower.')
  } else {
    console.log('Invalid Input.')
  }
}
console.log('\nDone.')
