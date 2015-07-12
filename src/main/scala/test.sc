val a : Int = 2

def f(i : Int)(f : Int => Int):Int = {f(i * i)}

f(a) {i => i * i}

def sideFce : Unit = {
  println("inside")
  1
}

def byName (a: => Unit): Unit = {
  a
  a
}

def byVal (a : Unit): Unit = {
  a
  a
}

byName(sideFce)
byVal(sideFce)


