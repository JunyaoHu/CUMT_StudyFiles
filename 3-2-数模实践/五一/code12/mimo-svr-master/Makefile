# Makefile layout originally developed by Bill Lynch
SOURCES     := $(sort $(wildcard src/*.cpp src/*.cu src/*.cc src/*.c))
OBJECTS     := $(sort $(patsubst src/%, obj/%.o, $(SOURCES)))
DEPENDS     := $(sort $(patsubst src/%, obj/%.d, $(SOURCES)))

# 
CPPFLAGS    += -I./inc
LDFLAGS     += -larmadillo 
LDFLAGS	    += 
CXX         := g++ -Wall -g

bin/msvr.x: $(OBJECTS)
	$(CXX) -o $@ $^ $(LDFLAGS)

clean:
	rm -rf bin obj html latex

obj/%.cpp.o: src/%.cpp
	$(CXX) $(CPPFLAGS) $(CXXFLAGS) -c $< -o $@

obj/%.cc.o: src/%.cc
	$(CXX) $(CPPFLAGS) $(CXXFLAGS) -c $< -o $@


obj/%.c.o: src/%.c
	$(CXX) $(CPPFLAGS) $(CFLAGS) -c $< -o $@

obj/%.cpp.d: src/%.cpp
	$(CXX) $(CPPFLAGS) $(CXXFLAGS) -MM -MT "$(strip $(patsubst %.d, %.o, $@) $@)" $< -o $@

obj/%.cc.d: src/%.cc
	$(CXX) $(CPPFLAGS) $(CXXFLAGS) -MM -MT "$(strip $(patsubst %.d, %.o, $@) $@)" $< -o $@

obj/%.c.d: src/%.c
	$(CXX) $(CPPFLAGS)  $(CFLAGS) -MM -MT "$(strip $(patsubst %.d, %.o, $@) $@)" $< -o $@

# Create system layout for Objects and binaries
ifneq ($(MAKECMDGOALS),clean)
$(shell mkdir -p bin obj)
-include $(DEPENDS)
endif
