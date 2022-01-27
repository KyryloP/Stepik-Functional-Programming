
object PrimeCheckerTask {

	def isPrime(n: Long): Boolean = {
		if (n % 2 == 0) false
		else {
			var d:Long = 3
			while (d*d < n && n % d != 0) {
				d += 1}
			if (n % d == 0 && n>3) false else true
		}
	}
}