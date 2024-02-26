/*
 * The program shows hows how to use if statements.
 *
 * By: Kaitlyn Ip
 * Version: 1.0
 * Since:   2024-02-20
 */

import promptSync from 'prompt-sync'

const prompt = promptSync()

const itemType = prompt('What Food? (Sub, Pizza, Soup): ')
const itemAmountString = prompt('How Many? (1-3): ')
const itemAmountInt = parseInt(itemAmountString)
let time = 1
let percent = 0.5

if (itemType === 'Sub') {
	  time = 45
} else if (itemType === 'Pizza') {
	  time = 60
} else if (itemType === 'Soup') {
	  time = 105
} else {
	  console.log('Invalid Input!')
}

if (itemAmountInt === 2) {
	  percent = 1.5
} else if (itemAmountInt === 3) {
	  percent = 2
} else if (itemAmountInt === 1) {
	  percent = 1
} else {
	  console.log('Invalid Input!')
}
const answer = time * percent
console.log(`Total cook time is: ${answer} seconds`)

console.log('\nDone.')
