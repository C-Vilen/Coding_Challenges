open System

let addTwoNumbers a b = a + b

[<EntryPoint>]
let main argv =
    let inputs = System.Console.ReadLine().Split(' ')
    let a = int inputs.[0]
    let b = int inputs.[1]
    let sum = addTwoNumbers a b
    printfn "%d" sum
    0
