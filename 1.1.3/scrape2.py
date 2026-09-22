import urllib.request
import re
from bs4 import BeautifulSoup

urls = [
    'https://www.javaguides.net/2018/10/spring-scope-annotation-with-singleton-scope-example.html',
    'https://www.javaguides.net/2018/09/spring-propertysource-annotation-with-example.html',
    'https://www.javaguides.net/2018/09/spring-autowired-annotation-with-example.html',
    'https://www.geeksforgeeks.org/springboot/custom-bean-scope-in-spring'
]

for url in urls:
    try:
        req = urllib.request.Request(url, headers={'User-Agent': 'Mozilla/5.0'})
        html = urllib.request.urlopen(req).read().decode('utf-8')
        soup = BeautifulSoup(html, 'html.parser')
        print(f'--- {url} ---')
        for pre in soup.find_all('pre'):
            print(pre.get_text())
    except Exception as e:
        print(f'Error fetching {url}: {e}')
