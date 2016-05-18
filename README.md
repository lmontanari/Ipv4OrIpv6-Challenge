# Ipv4OrIpv6-Challenge

You are given N strings that may or may not be an Internet Protocol ( IP)
address. 

You need to detect if the text contained in each of the lines represents
a. IPv4 address
b. IPv6 address or
c. Neither of these.

IPv4 was the first publicly used Internet Protocol; it used 4-byte addresses and
permitted 2 distinct value. The typical format of an IPv4 address is A.B.C.D where A,
B
, C and D are Integers lying between 0 and 255 (both inclusive).

IPv6, with 128 bits, was developed to permit the expansion of the address space. To
quote from the linked article:

The 128 bits of an IPv6 address are represented in 8 groups of 16 bits each.
Each group is written as 4 hexadecimal digits and the groups are separated by
colons (: ) . The address 2001: 0db8: 0000: 0000: 0000: ff00: 0042: 8329 is an example
of this representation.

Groups with consecutive zeros will be left as they are.

An IPv6 value such as "...:0:..." or "...:5:..." is address-wise identical to
"...:0000:..." or "...:0005:....". Leading zeros can be omitted in writing the
address.
Constraints:
1 ≤ N ≤ 50

There will be no extra text or white-space leading or trailing the IP address in a line
that has an IP address
The number of characters in each line will not exceed 500.
Note:
The code for handling the input and output is already provided.

Your task is to complete the checkIP function. ( The Input/Output
format is explained below for your reference. )

Input Format:
An integer N on a separate line, followed by N lines each containing a string that is
either an IPv4 address or an IPv6 address, or an arbitrary text which does not
correspond to either format.

Output Format:
N lines.
The i output line should describe what you detected the i input line to be, using
one of the following strings, with capitalization preserved:
a. IPv4
b. IPv6
c. Neither

Sample Input 0:
3 This line has j unk text.
121. 18. 19. 20
2001: 0db8: 0000: 0000: 0000: ff00: 0042: 8329

Sample Output 0:
Neither
IPv4
IPv6

Explanation 0:
In the first test case This line has junk text. is not a valid IPv4 or IPv6.
In the second test case 121. 18. 19. 20 is a valid IPv4.
In the third test case 2001:0db8:0000:0000:0000:ff00:0042:8329 is a valid IPv6.
