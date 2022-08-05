s = input()
n = len(s)
c = 0
for i in range(n):
	for j in range(n):
		a = s[i:j + 1].count('1')
		b = s[i:j + 1].count('0')
		c = c + a - b
		c = c % 1000000007

print(c)
