object Q_1 extends App {
  case class Point(var x: Int, var y: Int) {

    def add(a:Point) =  Point(this.x + a.x, this.y + a.y)

    def move(x:Int, y:Int):Unit = {
      this.x = this.x + x
      this.y = this.y + y
    }

    def distance(a:Point) : Double = {
      var xDist:Int = this.x - a.x
      var yDist:Int = this.y - a.y
      var dist: Int = xDist*xDist + yDist*yDist
      scala.math.sqrt(dist)
    }

    def invert() :Unit = {
      var tmp = this.x
      this.x = this.y
      this.y = tmp
    }
  }
  var a = Point(1,3)
  var b = Point(5,10)

  println(a.add(b))

  a.move(x = 1, y = 3)
  println(a)

  var c = a.distance(b)
  println(c)

  b.invert()
  println(b)
}
