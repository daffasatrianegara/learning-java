ipk = input("berapakah IPK anda : ")
ipk = float(ipk)
masa = input("berapa tahun anda menempuh masa kuliah anda : ")
masa = int(masa)

if (ipk >= 3.51 and ipk <= 4.00 and masa >= 2 and masa <= 4):
    print("anda mendapatkan predikat summa cumlaude")
elif (ipk >= 3.51 and ipk <= 4.00 and masa >= 4 and masa <= 10):
    print("anda mendapatkan predikat cumlaude") 
elif (ipk >= 3.01 and masa >=3 and ipk <= 4.00):
    print("anda mendapatkan predikat sangat memuaskan")
elif (ipk >= 2.76 and masa >= 3 and ipk <= 4.00):
    print("anda mendapatkan predikat memuaskan")
elif (ipk >= 2.00 and masa >=3 and ipk <= 4.00):
    print("anda mendapatkan predikat cukup")
elif (ipk < 2.00 and masa >=3 and ipk <= 4.00):
    print("mohon maaf, anda tidak lulus")
else:
    print("maaf, data yang anda masukkan salah")