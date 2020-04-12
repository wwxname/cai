package main

import (
	"fmt"
	"time"
)

func main() {
	go func() {
		fmt.Println("xxx")
		i := 0
		for true {
			go func() {
				i++
				fmt.Println(i)
				time.Sleep(time.Duration(200000) * time.Millisecond)
			}()
			time.Sleep(time.Duration(2) * time.Millisecond)
		}

	}()

	fmt.Println("www")
	time.Sleep(time.Duration(2000000) * time.Second)
}
