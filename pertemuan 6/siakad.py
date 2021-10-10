print("selamat datang di SIAKAD")
print("silahkan pilih menu berikut")
print("1. tambah data")
print("2. edit data")
print("3. hapus data")
print("4. lihat data")
menu = input("menu yang anda pilih : ")
menu = int(menu)
if (menu == 1):
    print("1. tambah data mahasiswa")
    print("2. tambah data mata kuliah")
    print("3. kembali")
    milih = input("menu yang anda pilih : ")
    milih = int(milih)
    if (milih == 1):
        nama = input("masukkan nama mahasiswa : ")
        nama = str(nama)
        print("mahasiswa yang anda tambah adalah : " + str(nama))

    elif (milih == 2):
        matkul = input("masukkan nama mata kuliah : ")
        matkul = str(matkul)
        print("mata kuliah yang anda tambah adalah : " + str(matkul))

    elif (milih == 3):
        print("terima kasih")
    
    else :
        print("menu tidak ada")

elif (menu > 1 and menu < 4):
    print("fitur belum ada")

else :
    print("menu tidak ada")
