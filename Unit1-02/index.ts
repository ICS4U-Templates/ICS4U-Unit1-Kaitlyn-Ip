/* This is a program that calculates the area of a circle.
	 *
* @author  Kaitlyn Ip
* @version 1.0
* @since   2024-02-20
*/

import { createPrompt } from 'bun-promptx'

// input
const massOfObjectString = createPrompt("Enter the mass of an object: ")

// error checking
const massOfObject = parseFloat(massOfObjectString.value || "-1")
if (isNaN(massOfObject) == true || massOfObject < 0) {
  console.log("Invalid input.")
} else {
  // process
  const Energy = massOfObject * Math.pow(2.99e8, 2)
  // output
  console.log(`An object with a mass of ${massOfObject}kg would produce ${Energy} J of energy.`)
}

console.log("\nDone.")
