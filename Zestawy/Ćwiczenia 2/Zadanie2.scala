//Zadanie 1
object WorkAndHoliday {
  def workAndHoliday(day: String): String  = {
    day match {
      case "Poniedzialek" => "Praca"
      case "Wtorek" => "Praca"
      case "Sroda" => "Praca"
      case "Czwartek" => "Praca"
      case "Piatek" => "Praca"
      case "Sobota" => "Weekend"
      case "Niedziela" => "Weekend"
      case default => "Nie ma takiego dnia..." + default
    }
  }

  def main(args: Array[String]): Unit = {
    workAndHoliday("Poniedzialek")
    workAndHoliday("weeknd")
    workAndHoliday("Sobota")
  }
}

//Zadanie 2
class BankAccount {

  private var balance: Double = 0.0

  def this(balance: Double) {
    this()
    this.balance = balance
  }

  def withdrawal(amout: Double)  {
    return balance += amout
  }

  def deposit(amout: Double) {
    return balance -= amout
  }

  def accountBalance: Double = balance
}

object BankAccountTest {

  def main(args: Array[String]): Unit = {
      var account_1 = new BankAccount()
      account_1.accountBalance
      account_1.deposit(150.0)
      account_1.accountBalance
      account_1.withdrawal(100.0)
      account_1.accountBalance

      var account_2 = new BankAccount(1000.0)
      account_2.accountBalance
      account_2.withdrawal(500.0)
      account_2.accountBalance
      account_2.deposit(50.0)
      account_2.accountBalance
  }
}

//Zadanie 3
class Osoba(val name: String, val lastName: String) { }
object TestOsoba {
  def greetMeFriend(person: Osoba): Unit = {
    person.name match {
      case "Tomek" => "Witaj" + person.name + " " + person.lastName
      case "Maria" => "Dzień dobry" + person.name + " " + person.lastName
      case "Szymon" => "Uszanowanie" + person.name + " " + person.lastName
      case default => "Nie znam Ciebie ..." + default
    }
  }

  def main(args: Array[String]): Unit = {
    greetMeFriend(new Osoba("Szymon", "Kowalski"))
  }
}

//Zadanie 4
object CubeTheValues {
  def cubeTheValues(valueOne: Int, func: Int => Int): Int = {
      func(func(func(valueOne)))
  }
  def sqr (value: Int): Int = value * value

  def main(args: Array[String]): Unit = {
    cubeTheValues(3, sqr)
  }
}

//Zadanie 5
abstract class Person(val name: String, val lastName: String) {
  def tax: Double
}
trait Employee extends Person {
  var salary: Double = 0.0
  override def tax = salary * 0.20
}
trait Student extends Person {

  override def tax = 0.0
}
trait Teacher extends Employee {

  override def tax= salary * 0.10
}
class Test {
  def main(args: Array[String]): Unit = {
    val student = new Person( "Szymon", "Student") with Student
    val employee = new Person( "Marek", "Employee") with Employee
    val teacher = new Person("Julia", "Teacher") with Teacher

    println("Student tax is: " + student.tax.toString)

    employee.salary = 3500.0
    println("Teacher tax is: " + employee.tax.toString + " and the salary is: " + employee.salary.toString)

    teacher.salary = 4000.0
    println("Teacher tax is: " + teacher.tax.toString + " and the salary is: " + teacher.salary.toString)


    val studentAndEmployee = new Person("Darek", "Student and Employee") with Student with Employee
    studentAndEmployee.salary = 500.0
    println("Student and Employee tax is: " + studentAndEmployee.tax.toString + " and his salary is: " + studentAndEmployee.salary.toString)

    val employeeAndStudent = new Person("Iwona", "Employee and Student") with Employee with Student
    employeeAndStudent.salary = 1500.0
    println("Employee and Student tax is: " + employeeAndStudent.tax.toString + " and his salary is: " + employeeAndStudent.salary.toString)
  }
}


