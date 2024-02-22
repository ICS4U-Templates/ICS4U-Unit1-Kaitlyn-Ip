/**
how to get input
* and deal with numbers
*
* By: Kaitlyn Ip
* Version: 1.0
* Since:   2024-02-15
**/
import { createPrompt } from 'bun-promptx'
    
console.log("Choose the length of the logs that you would like to move with a truck")

const logString = createPrompt(`Enter the lengths of the logs in meters between-> 0.25, 0.5, 1.0: `)

const logLength = parseFloat(logString.value)
	    
const logOnTruck = (1100 / (logLength * 20))

console.log(`The truck can carry ${logOnTruck} logs that are ${logLength} meters long.`)

console.log('\nDone.')
