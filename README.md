# Đề bài
### Tạo một lớp *Person* gồm các thuộc tính
1. int ID 
2. String Name
3. int Age
4. String Address
### Tạo lớp *Student* kế thừa lớp *Person* gồm các thuộc tính
1. int ID 
2. String Name
3. int Age
4. String Address
5. double Math
6. double Physics
7. double Chemistry
### Tạo lớp *Teacher* kế thừa lớp *Person* gồm các thuộc tính 
1. int ID 
2. String Name
3. int Age
4. String Address
5. int Experience

> Chú ý: Tất cả các Class phải có hàm khởi tạo mặc định (Constructor), khởi tạo có thuộc tính, getter settet, ngoài ra có thể có các phương thức khác. Ở class *Student* có phương thức *getAvg()* để tính điểm trung bình ba môn

## Viết chương trình quản lý *Student* và *Teacher* gồm các chức năng
> Một ID chỉ sử dụng một lần và duy nhất, nếu nhập bị trùng phải yêu cầu nhập lại, nếu nhập kí tự không phải là số thì yêu cầu nhập lại

1. Xem tất cả thông tin
2. Nhập vào 1 *Student*
3. Nhập vào 1 *Teacher*
4. Sắp xếp các *Person* 
    - 4.1. Tăng theo ID
    - 4.2. Giảm theo ID
    - 4.3. Tăng theo Name
    - 4.4. Giảm theo Name
    - 4.5. Tăng theo Age
    - 4.6. Giảm theo Age
    - 4.7. Tăng theo Address
    - 4.8. Giảm theo Address
    - 4.9 Sắp xếp các *Teacher* ở trước *Student*, *Teacher* sắp xếp theo Experience, *Student* sắp xếp theo điểm trung bình 3 môn
    >- Sử dụng hàm instanceof để kiểm tra class của *Person*
5. Tìm kiếm các *Person* dựa theo các tiêu chí sau
    - 5.1 ID
    - 5.2 Name
    - 5.3 Age
    - 5.4 Address
6. Xóa thông tin theo ID
7. Sửa thông tin theo ID
>- Cho người dùng xem thông tin người cần sửa
>- Cho phép người dùng sửa theo từng thông tin của người đó
8. Thoát khỏi chương trình

