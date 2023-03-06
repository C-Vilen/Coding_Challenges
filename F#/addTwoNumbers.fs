open System

[<EntryPoint>]
let main argv =
    let inputs = Console.ReadLine().Split(' ')
    let a = int inputs.[0]
    let b = int inputs.[1]
    let sum = a + b
    printfn "%d" sum
    0
