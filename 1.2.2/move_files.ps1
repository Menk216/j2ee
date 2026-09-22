$main = "c:\Users\User1\Documents\GitHub\j2ee\demo\src\main\java\com\example\demo"
$test = "c:\Users\User1\Documents\GitHub\j2ee\demo\src\test\java\com\example\demo"

New-Item -ItemType Directory -Force -Path "$main\bai1" | Out-Null
New-Item -ItemType Directory -Force -Path "$main\bai2\operation" | Out-Null
New-Item -ItemType Directory -Force -Path "$test\bai1" | Out-Null
New-Item -ItemType Directory -Force -Path "$test\bai2\operation" | Out-Null

Move-Item -Path "$main\DemoApplication.java" -Destination "$main\bai1\" -Force
Move-Item -Path "$test\DemoApplicationTests.java" -Destination "$test\bai1\" -Force

Move-Item -Path "$main\CalculatorApplication.java" -Destination "$main\bai2\" -Force
Move-Item -Path "$main\Calculator.java" -Destination "$main\bai2\" -Force
Move-Item -Path "$main\Operation.java" -Destination "$main\bai2\" -Force
Move-Item -Path "$main\operation\*.java" -Destination "$main\bai2\operation\" -Force
Remove-Item -Path "$main\operation" -Recurse -Force

Move-Item -Path "$test\CalculatorTest.java" -Destination "$test\bai2\" -Force
Move-Item -Path "$test\operation\*.java" -Destination "$test\bai2\operation\" -Force
Remove-Item -Path "$test\operation" -Recurse -Force

function Update-File {
    param($Path, $OldPkg, $NewPkg)
    $content = Get-Content $Path -Raw
    $content = $content -replace [regex]::Escape("package $OldPkg;"), "package $NewPkg;"
    $content = $content -replace [regex]::Escape("import com.example.demo.Operation;"), "import com.example.demo.bai2.Operation;"
    Set-Content -Path $Path -Value $content -Encoding UTF8
}

Update-File "$main\bai1\DemoApplication.java" "com.example.demo" "com.example.demo.bai1"
Update-File "$test\bai1\DemoApplicationTests.java" "com.example.demo" "com.example.demo.bai1"

Update-File "$main\bai2\CalculatorApplication.java" "com.example.demo" "com.example.demo.bai2"
Update-File "$main\bai2\Calculator.java" "com.example.demo" "com.example.demo.bai2"
Update-File "$main\bai2\Operation.java" "com.example.demo" "com.example.demo.bai2"
Update-File "$test\bai2\CalculatorTest.java" "com.example.demo" "com.example.demo.bai2"

Get-ChildItem -Path "$main\bai2\operation\*.java" | ForEach-Object {
    Update-File $_.FullName "com.example.demo.operation" "com.example.demo.bai2.operation"
}

Get-ChildItem -Path "$test\bai2\operation\*.java" | ForEach-Object {
    Update-File $_.FullName "com.example.demo.operation" "com.example.demo.bai2.operation"
}

$servletInit = Get-Content "$main\ServletInitializer.java" -Raw
$servletInit = $servletInit -replace [regex]::Escape("import org.springframework.boot.builder.SpringApplicationBuilder;"), "import org.springframework.boot.builder.SpringApplicationBuilder;`r`nimport com.example.demo.bai1.DemoApplication;"
Set-Content -Path "$main\ServletInitializer.java" -Value $servletInit -Encoding UTF8

Write-Output "DONE"

