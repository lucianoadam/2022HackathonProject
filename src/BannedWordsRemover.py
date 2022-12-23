f = open("/Users/lucianoadam/Documents/GitHub/2022HackathonProject/src/Words.txt", "r").read()
n = open("/Users/lucianoadam/Documents/GitHub/2022HackathonProject/src/Wordlist.txt", "w")
b = open("/Users/lucianoadam/Documents/GitHub/2022HackathonProject/src/BannedWords.txt", "r").read()

for word in f.split('\n'):
    ban = False
    for badWord in b.split('\n'):
        if badWord in word: 
            print(word)
            ban = True
            break
    if not ban:
        n.write(word + '\n')

n.close()