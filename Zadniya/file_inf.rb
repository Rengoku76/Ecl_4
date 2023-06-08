file_name = ARGV[0]
file = File.new(file_name, "r:UTF-8")
lines = file.readlines
file.close
puts "Открыли файл: " + file_name
empty_lines_counter = 0
last_five_lines = []
lines.each_with_index do |line, index|
    if line == "\n"
        empy_lines_counter += 1
    end
    if lines.size - index <= 5
        last_five_lines << line
    end
end
puts "Всего строк: "+ lines.length.to_s
puts "Пустых строк: " + empy_lines_counter.to_s
puts "Последние 5 строк файла: "
puts
for line in last_5_lines
    puts line
end