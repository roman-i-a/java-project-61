build-app:
	cd app
	./gradlew clean installDist


run: # Команда для запуска установленного приложения
	./app/build/install/app/bin/app
