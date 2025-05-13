<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Bảng Sinh Viên</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
     	table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
            background-color: #f9f9f9;
            color: #333;
        }
        th, td {
            border: 1px solid #999;
            padding: 10px;
            text-align: left;
        }
        thead {
            background-color: #007bff;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #e0f0ff;
        }
    </style>
</head>
<body>
        <table>
            <thead>
                <tr>
                    <th>STT</th>
                    <th>Ma SV</th>
                    <th>Ho va ten</th>
                    <th>Que quan</th>
                </tr>
            </thead>
            <tb>
                <tr>
                    <td>1</td>
                    <td>SV001</td>
                    <td>Nguyen Van An</td>
                    <td>Ha Noi</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>SV002</td>
                    <td>Tran Thi Phuong Anh</td>
                    <td>Da Nang</td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>SV003</td>
                    <td>Do Duc Viet</td>
                    <td>Quang Ninh</td>
                </tr>
            </tb>
        </table>

</body>
</html>
